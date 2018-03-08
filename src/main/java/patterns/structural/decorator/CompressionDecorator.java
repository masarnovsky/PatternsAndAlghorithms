package patterns.structural.decorator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class CompressionDecorator extends DataSourceDecorator {
    private int compressionLevel = 6;

    public CompressionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void writeData(String data) {
        super.writeData(compress(data));
    }

    @Override
    public String readData() {
        return decompress(super.readData());
    }

    private String compress(String data) {
        byte[] bytes = data.getBytes();
        try {
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            DeflaterOutputStream dos = new DeflaterOutputStream(bout, new Deflater(compressionLevel));
            dos.write(bytes);
            dos.close();
            bout.close();
            return Base64.getEncoder().encodeToString(bout.toByteArray());
        } catch (IOException e) {
            return null;
        }
    }

    private String decompress(String data) {
        byte[] bytes = Base64.getDecoder().decode(data);
        try {
            InputStream is = new ByteArrayInputStream(bytes);
            InflaterInputStream iis = new InflaterInputStream(is);
            ByteArrayOutputStream baus = new ByteArrayOutputStream(512);
            int b;
            while ((b = iis.read()) != -1) {
                baus.write(b);
            }
            is.close();
            iis.close();
            baus.close();
            return new String(baus.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

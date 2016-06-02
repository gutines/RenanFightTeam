package br.com.util.foto;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.imageio.ImageIO;

import org.primefaces.event.FileUploadEvent;


@ManagedBean
@ViewScoped
public class FotoUtil {
	
	static String test = File.separator + "testeJava" + File.separator;
	
	private byte[] imageBytes;

	public void handlePictureUploaded(FileUploadEvent uploadEvent){
		System.out.println("handlePictureUploaded");
        this.imageBytes = uploadEvent.getFile().getContents();
    }
	
	public void salvar(){
		
		
	}
	
	
	public void handlePicture() {
		
        try {
            salvarNoDisco(ImageIO.read(new ByteArrayInputStream(imageBytes)), "Teste");
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
	
	private static void salvarNoDisco(BufferedImage fotoSalvar, String nomeFoto) throws IOException{
        File f = new File(test);
        System.out.println("Passo 1");
        if(!f.exists()){
            f.mkdirs(); f.setReadable(true); f.setWritable(true);
            System.out.println("Passo 2");
        }
 
        ImageIO.write(fotoSalvar, "png", new File(test + nomeFoto));
        System.out.println("Passo 3");
    }

}

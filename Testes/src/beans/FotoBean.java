package beans;

import java.io.File;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

public class FotoBean {

	private byte[] foto;
	private File upLoadFoto;

	public File getUpLoadFoto() {
		return upLoadFoto;
	}

	public void setUpLoadFoto(File upLoadFoto) {
		this.upLoadFoto = upLoadFoto;
		System.out.println("Arquivo: " + upLoadFoto.getAbsolutePath());
	}

	public String pathFoto() {
		return upLoadFoto.getPath();
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;

	}

	public void upload() {
		if (upLoadFoto != null) {
			FacesMessage message = new FacesMessage("Succesful",
					upLoadFoto.getAbsolutePath() + " is uploaded.");
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
	}

	public void handlePictureUploaded(FileUploadEvent uploadEvent) {

		try {
			this.foto = uploadEvent.getFile().getContents();
		} catch (Exception e) {
			System.out.println("Erro ao importar arquivo");
		}
		
		System.out.println("Tamanho em Bytes: " + foto.length);

	}

}

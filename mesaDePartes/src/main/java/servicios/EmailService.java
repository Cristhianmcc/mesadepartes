/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.Multipart;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;
import java.io.File;
import java.util.Properties;

/**
 *
 * @author crist
 */
public class EmailService {

    private final String remitenteCorreo = "institutopublicolurin01@gmail.com"; // Cambia a tu correo
    private final String remitenteContraseña = "xdjrtrzgiyrjuwzx"; // Cambia a la contraseña de tu correo

    public void enviarCorreoConAdjunto(String destinatarioCorreo, String asunto, String mensaje, File archivoAdjunto) {
         if (archivoAdjunto == null || !archivoAdjunto.exists()) {
            System.err.println("Error: Archivo adjunto no encontrado o es nulo.");
            return;
        }

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(remitenteCorreo, remitenteContraseña);
            }
        });

        try {
            Message correo = new MimeMessage(session);
            correo.setFrom(new InternetAddress(remitenteCorreo));
            correo.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatarioCorreo));
            correo.setSubject(asunto);

            MimeBodyPart mensajeCuerpo = new MimeBodyPart();
            mensajeCuerpo.setText(mensaje);

            MimeBodyPart adjunto = new MimeBodyPart();
            adjunto.attachFile(archivoAdjunto);

            Multipart multiparte = new MimeMultipart();
            multiparte.addBodyPart(mensajeCuerpo);
            multiparte.addBodyPart(adjunto);

            correo.setContent(multiparte);

            Transport.send(correo);
            System.out.println("Correo enviado exitosamente a " + destinatarioCorreo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

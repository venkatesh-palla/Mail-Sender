# Mail-Sender
This is a Spring Boot application that allows sending plain text emails to multiple recipients using JavaMailSender.

# Application.properties file
spring.mail.host=smtp.gmail.com

spring.mail.port=587

spring.mail.username=your-email@gmail.com

spring.mail.password=your-app-password

spring.mail.properties.mail.smtp.auth=true

spring.mail.properties.mail.smtp.starttls.enable=true

# POST /sendEmail

{
    "to": ["recipient1@example.com", "recipient2@example.com"],
    
    "subject": "Subject",
    
    "text": "Hello, this is a  email."
}


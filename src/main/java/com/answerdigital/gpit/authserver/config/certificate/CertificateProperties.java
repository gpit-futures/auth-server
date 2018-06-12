package com.answerdigital.gpit.authserver.config.certificate;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="certificate")
public class CertificateProperties {
	
	private String filename;
	private String password;
	private String keyPair;

	public String getFilename() {
		return filename;
	}
	public void setFilename(final String filename) {
		this.filename = filename;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(final String password) {
		this.password = password;
	}
	
	public String getKeyPair() {
		return keyPair;
	}
	public void setKeyPair(final String keyPair) {
		this.keyPair = keyPair;
	}
	
}

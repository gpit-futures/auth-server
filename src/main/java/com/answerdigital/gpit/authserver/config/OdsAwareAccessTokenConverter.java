package com.answerdigital.gpit.authserver.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

public class OdsAwareAccessTokenConverter extends JwtAccessTokenConverter {
	
	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		
		String odsId = authentication.getUserAuthentication().getName().equals("joe.blog")?"GPC002":"GPC001";
		
		Map<String, Object> properties = new HashMap<>();
		properties.put("odsId", odsId);
		
		((DefaultOAuth2AccessToken)accessToken).setAdditionalInformation(properties);
		
		// Encode Token to JWT
		String encoded = super.encode(accessToken, authentication);

		// Set JWT as value of the token
		((DefaultOAuth2AccessToken) accessToken).setValue(encoded);
		
		return accessToken;
	}
}

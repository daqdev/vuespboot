package ar.com.telecom.fmvue.util;

import java.util.Base64;
import java.util.Base64.Decoder;

public class EncryptedDataSource {
 
	public static String decode(String decode) {
		Decoder decoder = Base64.getDecoder();
		try {
			byte[] bytes = decoder.decode(decode);
			decode = new String(bytes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return decode;
	}
	
}
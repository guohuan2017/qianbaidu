package util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
	// 用于返回已加密的字符串
	public static String jiami(String str) throws UnsupportedEncodingException {
		String password = null;
		MessageDigest md;
		try {
			// 固定加密算法
			md = MessageDigest.getInstance("MD5");
			// 获取加密后的数组
			byte[] b = md.digest(str.getBytes("utf-8"));
			// 进行BASE64编码
			sun.misc.BASE64Encoder base64Encoder = new sun.misc.BASE64Encoder();
			// 将加密后的数组进行base64编码，转换成对应的字符串
			password = base64Encoder.encode(b);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return password;
	}

}

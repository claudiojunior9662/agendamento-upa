package com.agendamento.upa.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Util {
	public static String md5(String senha) throws NoSuchAlgorithmException{
		MessageDigest digest = MessageDigest.getInstance("MD5");
		BigInteger hash = new BigInteger(1, digest.digest(senha.getBytes()));
		return hash.toString(16);
	}
}

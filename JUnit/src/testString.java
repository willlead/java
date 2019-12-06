

public class testString {
	public static int count(String src, String target) {
		int count = 0;
		int pos = 0;
		while (true) {
			pos = src.indexOf(target, pos);
			if (pos != -1) {
				count++;
				pos += target.length();

			} else {
				break;
			}
		}
		return count;
	}

	public static String fillZero(String src, int length) {
		if (src == null || src.length() == length) {
			return src;

		} else if (length <= 0) {
			return "";

		} else if (src.length() > length) {
			return src.substring(0, length);
		}

		char[] chArr = new char[length];
		for (int i = 0; i < chArr.length; i++)
			chArr[i] = '0';
		System.arraycopy(src.toCharArray(), 0, chArr, length - src.length(), src.length());

		return new String(chArr);
	}

	public static boolean contains(String src, String target) {
		return src.indexOf(target) != -1;
	}

	public static String delChar(String src, String delCh) {
		StringBuffer sb = new StringBuffer(src.length());

		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			if (delCh.indexOf(ch) == -1)
				sb.append(ch);

		}
		return sb.toString();

	}

}


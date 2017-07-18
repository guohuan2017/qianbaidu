package util;

import java.util.UUID;

public class createUUID {
		// 获取UUID
		public String getUUID() {
			// 生成随机的UUID
			UUID uuid = UUID.randomUUID();
			// 转换成字符串
			String string = uuid.toString();
			// 去除横杠
			string = string.replaceAll("-", "");
			return string;
		}
}

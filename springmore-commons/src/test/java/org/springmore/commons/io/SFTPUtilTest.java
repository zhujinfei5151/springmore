package org.springmore.commons.io;


import java.io.File;

import org.junit.Test;

public class SFTPUtilTest {

	@Test
	public void 上传不设置保存文件名() {
		SFTPUtil sftp = new SFTPUtil();
		File file = new File("C:\\Users\\bypay\\Desktop\\CopyOnWriteArrayListDemo.java");
		sftp.setLocal(file);
		sftp.uploadFile();
	}

	@Test
	public void 上传并设置保存文件名() {
		SFTPUtil sftp = new SFTPUtil();
		File file = new File("C:\\Users\\bypay\\Desktop\\CopyOnWriteArrayListDemo.java");
		sftp.setLocal(file);
		sftp.setRemote("upload.txt");
		sftp.uploadFile();
	}
	
	@Test
	public void 上传并设置保存路径() {
		SFTPUtil sftp = new SFTPUtil();
		File file = new File("C:\\Users\\bypay\\Desktop\\CopyOnWriteArrayListDemo.java");
		sftp.setLocal(file);
		sftp.setRemote("upload.txt");
		sftp.setRemotePath("/home/test");
		sftp.uploadFile();
	}
}

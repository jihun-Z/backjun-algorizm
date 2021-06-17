package codeUP_practice;

import java.io.File;

public class FileUpload {
	
	public static void main(String[] args) {
		
		
		File file=new File("C:/123.txt");
		if(file.exists()) {//파일 존재 여부 확인
			if(file.isDirectory()) {//파일이 디렉토리인지 확인
				File[] files=file.listFiles();
				for(int i=0;i<files.length;i++) {
					if(files[i].delete()) System.out.println(files[i].getName()+"파일 삭제 성공");
					else System.out.println(files[i].getName()+"파일 삭제 실패 ");
					
				}
			}
			if(file.delete()) System.out.println("파일 삭제 성공"); 
			else System.out.println("파일 삭제 실패");			
			
		}else {
			System.out.println("파일이 존재하지 않습니다.");
		}
	}

}

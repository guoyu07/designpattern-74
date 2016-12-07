package my.designpattern.construct.adapter;

public class ClientClass {
	public static void main(String[] args) {
		UserInfoDao uid = new UserInfoDaoImplAdapter();
		uid.saveUserEmail();
		uid.saveUserName();
	}
}

package my.designpattern.construct.adapter;

public class UserInfoDaoImplAdapter implements UserInfoDao{

	private EncryptionMod2 em2;
	
	public UserInfoDaoImplAdapter(){
		em2 = new EncryptionMod2();
	}
	
	@Override
	public void saveUserName() {
		// TODO Auto-generated method stub
		em2.encryption();
		System.out.println("加密 存储进数据库");
	}

	@Override
	public void saveUserEmail() {
		// TODO Auto-generated method stub
		em2.encryption();
		System.out.println("加密 存储进数据库");
	}
	
}

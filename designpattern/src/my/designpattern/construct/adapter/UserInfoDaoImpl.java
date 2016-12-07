package my.designpattern.construct.adapter;

public class UserInfoDaoImpl implements UserInfoDao {

	private EncryptionMod1 em1 = new EncryptionMod1();
	
	@Override
	public void saveUserName() {
		// TODO Auto-generated method stub
		em1.encryption();
		System.out.println("加密 存储进数据库");
	}

	@Override
	public void saveUserEmail() {
		// TODO Auto-generated method stub
		em1.encryption();
		System.out.println("加密 存储进数据库");
	}

}

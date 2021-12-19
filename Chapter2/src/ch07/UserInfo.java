package ch07;

public class UserInfo {
    // 시그니처는 같고 파라미터가 다른 경우 ==> 오버로딩
    // 오버로딩을 사용하는 이유: 사용하는 쪽의 편의성을 위해서
    public String userId;
    public String userPassword;
    public String userName;
    public String userAddress;
    public String phoneNumber;

    public UserInfo(){}

    public UserInfo(String userId, String userPassword, String userName) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userName = userName;
    }

    public String showUserInfo() {
        return "고객님의 아이디는 " + userId + "이고, 등록된 이름은 " + userName + "입니다.";
    }
}

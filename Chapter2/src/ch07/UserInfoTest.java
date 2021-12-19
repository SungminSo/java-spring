package ch07;

public class UserInfoTest {
    public static void main(String[] args) {
        UserInfo userLee = new UserInfo();
        userLee.userId = "a12345";
        userLee.userPassword = "qwer1234";
        userLee.userName = "Lee";

        System.out.println(userLee.showUserInfo());

        UserInfo userKim = new UserInfo("b12345", "asdf1234", "Kim");
        System.out.println(userKim.showUserInfo());
    }
}

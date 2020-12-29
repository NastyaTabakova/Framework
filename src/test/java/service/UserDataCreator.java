package service;

import model.UserData;

public class UserDataCreator {
    public static final String USER_STREET ="test.data.street";
    public static final String USER_HOUSE="test.data.house";
    public static final String USER_APARTMENT="test.data.apartment";
    public static final String USER_INDEX="test.data.index";
    public static final String USER_NAME="test.data.name";

    public static UserData withCredentialsFromProperty(){
        return new UserData(USER_STREET, USER_HOUSE,USER_APARTMENT,USER_INDEX,USER_NAME);
    }
}

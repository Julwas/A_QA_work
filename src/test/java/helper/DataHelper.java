package helper;

import models.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.configuration.ReadProperties;

public class DataHelper {

    public static User getAdminUser() {
        Logger logger = LogManager.getLogger(DataHelper.class);

        User user = new User();
        user.setEmail(ReadProperties.username());
        user.setPassword(ReadProperties.password());

        logger.info(user.toString());
        return user;
    }

}
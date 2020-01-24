package entities;

import java.sql.Timestamp;

public class User {
    private Long id;
    private String username;
    private String email;
    private String pwd;
    private Timestamp createdOn;
    private Timestamp lastModifiedOn;
}

package model;

import java.util.UUID;
import lombok.Data;

@Data
public class user {

  private UUID id;

  private String name;

  private String address;

  private String city;
}

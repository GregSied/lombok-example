package test;

import lombok.NonNull;
import lombok.Value;

@Value
public class Shop {
  @NonNull private final String name;
  @NonNull private final String address;
}

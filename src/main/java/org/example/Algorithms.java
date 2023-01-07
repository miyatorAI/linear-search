package org.example;

import java.util.List;

public class Algorithms {

  int linearSearch(final List<Long> list, final long targetNum) throws Exception {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == targetNum) {
        return i;
      }
    }
    throw new Exception("not found");
  }
}

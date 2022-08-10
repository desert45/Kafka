package com.sacavix.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@AllArgsConstructor
@Getter
@Setter
@Builder
public class Account {  


  private String id;
  
  private String documentNumber;
  
  private String numberAccount;
  
  private List<TypeAccount> type;

}

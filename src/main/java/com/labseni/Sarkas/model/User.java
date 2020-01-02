package com.labseni.Sarkas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name="Crot")
@ApiModel(description="All details about the Employee. ")
public class User {
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  @Column(name="id")

	  @ApiModelProperty(notes = "The database generated User ID")
	  private Integer id;
	  
	  @ApiModelProperty(notes = "The user name")
	  @Column (name="name")
	  private String name;

	  @ApiModelProperty(notes = "The user email")
	  @Column(name="email")
	  private String email;

	  public Integer getId() {
	    return id;
	  }

	  public void setId(Integer id) {
	    this.id = id;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getEmail() {
	    return email;
	  }

	  public void setEmail(String email) {
	    this.email = email;
	  }
	

}

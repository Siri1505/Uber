package com.Spring.cabbooking.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


@ToString
@AllArgsConstructor
public class Rider {
  String id;
  String name;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Rider(String id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Rider() {
	super();
}
@Override
public String toString() {
	return "Rider [id=" + id + ", name=" + name + "]";
}
  
}

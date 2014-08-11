package org.example.jsfdemo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean
@RequestScoped
public class MyFormBean implements Serializable {
	
	private static final long serialVersionUID = 3369901704873962461L;
	
	private String field1;
	private String field2;

	public MyFormBean() {
		super();
	}

	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public String submit() {
		// validate here and show error on form
		System.out.println(String.format("field1 = %s, field2 = %s", field1,
				field2));
		return "submitted";
	}
}

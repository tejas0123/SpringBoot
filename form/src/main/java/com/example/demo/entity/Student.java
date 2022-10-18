package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Student {
	
	
		@Id
		@GeneratedValue
		private int id;
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", USN=" + USN + ", branch=" + branch + ", sem=" + sem
					+ ", getId()=" + getId() + ", getName()=" + getName() + ", getUSN()=" + getUSN() + ", getBranch()="
					+ getBranch() + ", getSem()=" + getSem() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + ", toString()=" + super.toString() + "]";
		}

		@Column
		private String name;
		@Column
		private String USN;
		@Column
		private String branch;
		@Column
		private int sem;
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUSN() {
			return USN;
		}

		public void setUSN(String uSN) {
			USN = uSN;
		}

		public String getBranch() {
			return branch;
		}

		public void setBranch(String branch) {
			this.branch = branch;
		}

		public int getSem() {
			return sem;
		}

		public void setSem(int sem) {
			this.sem = sem;
		}

		
		
		public Student()
		{
			
		}
		
		public Student(int id, String name, String uSN, String branch, int sem) 
		{
			super();
			this.id = id;
			this.name = name;
			USN = uSN;
			this.branch = branch;
			this.sem = sem;
		}
		
		

}

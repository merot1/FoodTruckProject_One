package com.skilldistillery.foodTruckProject;

public class FoodTruck {
	private int id;
	private String name;
	private String food;
	private int rating;
	
	private int nextId = 1;

	public FoodTruck() {
		super();
		this.id = nextId;
		nextId++;
	}

	public FoodTruck(String name, String food, int rating) {
		super();
		this.name = name;
		this.food = food;
		this.rating = rating;
		this.id = nextId;
		nextId++;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getNextId() {
		return nextId;
	}

	public void setNextId(int nextId) {
		this.nextId = nextId;
	}

	@Override
	public String toString() {
		return "FoodTruck [id=" + id + ", name=" + name + ", food=" + food + ", rating=" + rating + "]";
	}

	
	
	
	
		
	
	
	
}

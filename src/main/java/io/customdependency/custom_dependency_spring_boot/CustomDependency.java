package io.customdependency.custom_dependency_spring_boot;


public class CustomDependency
{
	int value;
    CustomDependency()
    {
    	value=0;
    }
    CustomDependency(int v)
    {
    	value=v;
    }
	public int getValue() {
		return value;
	}
}

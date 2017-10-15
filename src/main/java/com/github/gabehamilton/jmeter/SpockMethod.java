package com.github.gabehamilton.jmeter;

import java.util.Objects;

/**
 * Created by gabe on 1/27/15.
 *
 * Once compiled spock test methods get names like $spock_feature_0_0.
 * This object holds that name plus the "real" name from the @FeatureMetaData.name
 */
public class SpockMethod {
	String methodName;

	String specName;

	public SpockMethod(String methodName, String specName)
	{
		this.methodName = methodName;
		this.specName = specName;
	}

	/** What to display in JComboBox */
	public String toString(){return specName;}
	@Override
	public boolean equals(Object o)
	{
		if (o == this) return true;
		if (!(o instanceof SpockMethod)) {
			return false;
		}
		SpockMethod other = (SpockMethod) o;
		if (other != null) {
			if (this.methodName != null) {
				return this.methodName.equals(other.getMethodName());
			}else if (this.specName != null) {
				return this.specName.equals(other.getSpecName());
			} else
				return false;
		} else
			return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(methodName, specName);
	}


	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getSpecName() {
		return specName;
	}

	public void setSpecName(String specName) {
		this.specName = specName;
	}
}

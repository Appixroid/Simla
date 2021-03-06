package interpreter.utils;

import interpreter.managers.DataManagers.TYPES;

public class Function
{
	private String label;
	private String code;
	private String[] args;
	private boolean returnArray;
	private TYPES returnType;
	private int currentCall;
	private int functionOffset;
	
	public Function(String label, TYPES returnType, boolean returnArray, int offset, String... args)
	{
		this.label = label;
		this.args = args;
		
		this.code = "";
		this.returnType = returnType;
		this.returnArray = returnArray;
		this.currentCall = 0;
		this.functionOffset = offset;
	}

	public String getLabel()
	{
		return label;
	}

	public String getCode()
	{
		return code;
	}

	public String[] getArgs()
	{
		return args;
	}

	public TYPES getReturnType()
	{
		return returnType;
	}
	
	public boolean returnArray()
	{
		return this.returnArray;
	}

	public void addCode(String code)
	{
		this.code += code;
	}

	public int getCurrentCall()
	{
		return currentCall;
	}

	public void call()
	{
		this.currentCall++;
	}
	
	public void uncall()
	{
		this.currentCall--;
	}
	
	public int getOffset()
	{
		return this.functionOffset;
	}
}

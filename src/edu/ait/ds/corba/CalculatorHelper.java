package edu.ait.ds.corba;


/**
* edu_ait_ds_corba/CalculatorHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from calculator.idl
* Thursday, 9 March, 2023 10:29:36 AM IST
*/

abstract public class CalculatorHelper
{
  private static String  _id = "IDL:edu_ait_ds_corba/Calculator:1.0";

  public static void insert (org.omg.CORBA.Any a, edu.ait.ds.corba.Calculator that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static edu.ait.ds.corba.Calculator extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (edu.ait.ds.corba.CalculatorHelper.id (), "Calculator");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static edu.ait.ds.corba.Calculator read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_CalculatorStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, edu.ait.ds.corba.Calculator value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static edu.ait.ds.corba.Calculator narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof edu.ait.ds.corba.Calculator)
      return (edu.ait.ds.corba.Calculator)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      edu.ait.ds.corba._CalculatorStub stub = new edu.ait.ds.corba._CalculatorStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static edu.ait.ds.corba.Calculator unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof edu.ait.ds.corba.Calculator)
      return (edu.ait.ds.corba.Calculator)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      edu.ait.ds.corba._CalculatorStub stub = new edu.ait.ds.corba._CalculatorStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}

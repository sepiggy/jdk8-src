package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/InvalidPolicy.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/ws/workspace/jdk-8u275/label/windows-x86_64/type/b8/build/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Thursday, November 5, 2020 3:58:42 AM PST
*/

public final class InvalidPolicy extends org.omg.CORBA.UserException
{
  public short index = (short)0;

  public InvalidPolicy ()
  {
    super(InvalidPolicyHelper.id());
  } // ctor

  public InvalidPolicy (short _index)
  {
    super(InvalidPolicyHelper.id());
    index = _index;
  } // ctor


  public InvalidPolicy (String $reason, short _index)
  {
    super(InvalidPolicyHelper.id() + "  " + $reason);
    index = _index;
  } // ctor

} // class InvalidPolicy

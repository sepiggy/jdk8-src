package org.omg.IOP;


/**
* org/omg/IOP/IOR.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/ws/workspace/jdk-8u275/label/windows-x86_64/type/b8/build/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Thursday, November 5, 2020 3:58:41 AM PST
*/

public final class IOR implements org.omg.CORBA.portable.IDLEntity
{

  /** The type id, represented as a String. */
  public String type_id = null;

  /** 
	 * An array of tagged profiles associated with this 
	 * object reference. 
	 */
  public org.omg.IOP.TaggedProfile profiles[] = null;

  public IOR ()
  {
  } // ctor

  public IOR (String _type_id, org.omg.IOP.TaggedProfile[] _profiles)
  {
    type_id = _type_id;
    profiles = _profiles;
  } // ctor

} // class IOR
package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/DynValueCommonOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/ws/workspace/jdk-8u275/label/windows-x86_64/type/b8/build/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Thursday, November 5, 2020 3:58:41 AM PST
*/


/**
    * DynValueCommon provides operations supported by both the DynValue and DynValueBox interfaces.
    */
public interface DynValueCommonOperations  extends org.omg.DynamicAny.DynAnyOperations
{

  /**
        * Returns true if the DynValueCommon represents a null value type.
        */
  boolean is_null ();

  /**
        * Changes the representation of a DynValueCommon to a null value type.
        */
  void set_to_null ();

  /**
        * Replaces a null value type with a newly constructed value. Its components are initialized
        * to default values as in DynAnyFactory.create_dyn_any_from_type_code.
        * If the DynValueCommon represents a non-null value type, then this operation has no effect. 
        */
  void set_to_value ();
} // interface DynValueCommonOperations

package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/DynValueBox.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/ws/workspace/jdk-8u275/label/windows-x86_64/type/b8/build/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Thursday, November 5, 2020 3:58:41 AM PST
*/


/**
    * DynValueBox objects support the manipulation of IDL boxed value types.
    * The DynValueBox interface can represent both null and non-null value types.
    * For a DynValueBox representing a non-null value type, the DynValueBox has a single component
    * of the boxed type. A DynValueBox representing a null value type has no components
    * and a current position of -1.
    */
public interface DynValueBox extends DynValueBoxOperations, org.omg.DynamicAny.DynValueCommon, org.omg.CORBA.portable.IDLEntity 
{
} // interface DynValueBox
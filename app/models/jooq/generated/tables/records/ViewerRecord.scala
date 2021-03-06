/*
 * This file is generated by jOOQ.
 */
package generated.tables.records


import generated.enums.Gender
import generated.tables.Viewer

import java.lang.Float
import java.lang.Integer
import java.lang.Long
import java.lang.String

import javax.annotation.Generated

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record11
import org.jooq.Row11
import org.jooq.impl.UpdatableRecordImpl

import scala.Array


/**
 * This class is generated by jOOQ.
 */
@Generated(
  value = Array(
    "http://www.jooq.org",
    "jOOQ version:3.11.0"
  ),
  comments = "This class is generated by jOOQ"
)
class ViewerRecord extends UpdatableRecordImpl[ViewerRecord](Viewer.VIEWER) with Record11[Long, String, Integer, Integer, Integer, Integer, Integer, Float, Gender, String, Long] {

  /**
   * Setter for <code>public.viewer.id</code>.
   */
  def setId(value : Long) : Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>public.viewer.id</code>.
   */
  def getId : Long = {
    val r = get(0)
    if (r == null) null else r.asInstanceOf[Long]
  }

  /**
   * Setter for <code>public.viewer.username</code>.
   */
  def setUsername(value : String) : Unit = {
    set(1, value)
  }

  /**
   * Getter for <code>public.viewer.username</code>.
   */
  def getUsername : String = {
    val r = get(1)
    if (r == null) null else r.asInstanceOf[String]
  }

  /**
   * Setter for <code>public.viewer.userwatching</code>.
   */
  def setUserwatching(value : Integer) : Unit = {
    set(2, value)
  }

  /**
   * Getter for <code>public.viewer.userwatching</code>.
   */
  def getUserwatching : Integer = {
    val r = get(2)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>public.viewer.usercompleted</code>.
   */
  def setUsercompleted(value : Integer) : Unit = {
    set(3, value)
  }

  /**
   * Getter for <code>public.viewer.usercompleted</code>.
   */
  def getUsercompleted : Integer = {
    val r = get(3)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>public.viewer.useronhold</code>.
   */
  def setUseronhold(value : Integer) : Unit = {
    set(4, value)
  }

  /**
   * Getter for <code>public.viewer.useronhold</code>.
   */
  def getUseronhold : Integer = {
    val r = get(4)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>public.viewer.userdropped</code>.
   */
  def setUserdropped(value : Integer) : Unit = {
    set(5, value)
  }

  /**
   * Getter for <code>public.viewer.userdropped</code>.
   */
  def getUserdropped : Integer = {
    val r = get(5)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>public.viewer.userplantowatch</code>.
   */
  def setUserplantowatch(value : Integer) : Unit = {
    set(6, value)
  }

  /**
   * Getter for <code>public.viewer.userplantowatch</code>.
   */
  def getUserplantowatch : Integer = {
    val r = get(6)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>public.viewer.userdaysspentwatching</code>.
   */
  def setUserdaysspentwatching(value : Float) : Unit = {
    set(7, value)
  }

  /**
   * Getter for <code>public.viewer.userdaysspentwatching</code>.
   */
  def getUserdaysspentwatching : Float = {
    val r = get(7)
    if (r == null) null else r.asInstanceOf[Float]
  }

  /**
   * Setter for <code>public.viewer.gender</code>.
   */
  def setGender(value : Gender) : Unit = {
    set(8, value)
  }

  /**
   * Getter for <code>public.viewer.gender</code>.
   */
  def getGender : Gender = {
    val r = get(8)
    if (r == null) null else r.asInstanceOf[Gender]
  }

  /**
   * Setter for <code>public.viewer.location</code>.
   */
  def setLocation(value : String) : Unit = {
    set(9, value)
  }

  /**
   * Getter for <code>public.viewer.location</code>.
   */
  def getLocation : String = {
    val r = get(9)
    if (r == null) null else r.asInstanceOf[String]
  }

  /**
   * Setter for <code>public.viewer.statsepisodes</code>.
   */
  def setStatsepisodes(value : Long) : Unit = {
    set(10, value)
  }

  /**
   * Getter for <code>public.viewer.statsepisodes</code>.
   */
  def getStatsepisodes : Long = {
    val r = get(10)
    if (r == null) null else r.asInstanceOf[Long]
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------
  override def key : Record1[String] = {
    return super.key.asInstanceOf[ Record1[String] ]
  }

  // -------------------------------------------------------------------------
  // Record11 type implementation
  // -------------------------------------------------------------------------

  override def fieldsRow : Row11[Long, String, Integer, Integer, Integer, Integer, Integer, Float, Gender, String, Long] = {
    super.fieldsRow.asInstanceOf[ Row11[Long, String, Integer, Integer, Integer, Integer, Integer, Float, Gender, String, Long] ]
  }

  override def valuesRow : Row11[Long, String, Integer, Integer, Integer, Integer, Integer, Float, Gender, String, Long] = {
    super.valuesRow.asInstanceOf[ Row11[Long, String, Integer, Integer, Integer, Integer, Integer, Float, Gender, String, Long] ]
  }
  override def field1 : Field[Long] = Viewer.VIEWER.ID
  override def field2 : Field[String] = Viewer.VIEWER.USERNAME
  override def field3 : Field[Integer] = Viewer.VIEWER.USERWATCHING
  override def field4 : Field[Integer] = Viewer.VIEWER.USERCOMPLETED
  override def field5 : Field[Integer] = Viewer.VIEWER.USERONHOLD
  override def field6 : Field[Integer] = Viewer.VIEWER.USERDROPPED
  override def field7 : Field[Integer] = Viewer.VIEWER.USERPLANTOWATCH
  override def field8 : Field[Float] = Viewer.VIEWER.USERDAYSSPENTWATCHING
  override def field9 : Field[Gender] = Viewer.VIEWER.GENDER
  override def field10 : Field[String] = Viewer.VIEWER.LOCATION
  override def field11 : Field[Long] = Viewer.VIEWER.STATSEPISODES
  override def component1 : Long = getId
  override def component2 : String = getUsername
  override def component3 : Integer = getUserwatching
  override def component4 : Integer = getUsercompleted
  override def component5 : Integer = getUseronhold
  override def component6 : Integer = getUserdropped
  override def component7 : Integer = getUserplantowatch
  override def component8 : Float = getUserdaysspentwatching
  override def component9 : Gender = getGender
  override def component10 : String = getLocation
  override def component11 : Long = getStatsepisodes
  override def value1 : Long = getId
  override def value2 : String = getUsername
  override def value3 : Integer = getUserwatching
  override def value4 : Integer = getUsercompleted
  override def value5 : Integer = getUseronhold
  override def value6 : Integer = getUserdropped
  override def value7 : Integer = getUserplantowatch
  override def value8 : Float = getUserdaysspentwatching
  override def value9 : Gender = getGender
  override def value10 : String = getLocation
  override def value11 : Long = getStatsepisodes

  override def value1(value : Long) : ViewerRecord = {
    setId(value)
    this
  }

  override def value2(value : String) : ViewerRecord = {
    setUsername(value)
    this
  }

  override def value3(value : Integer) : ViewerRecord = {
    setUserwatching(value)
    this
  }

  override def value4(value : Integer) : ViewerRecord = {
    setUsercompleted(value)
    this
  }

  override def value5(value : Integer) : ViewerRecord = {
    setUseronhold(value)
    this
  }

  override def value6(value : Integer) : ViewerRecord = {
    setUserdropped(value)
    this
  }

  override def value7(value : Integer) : ViewerRecord = {
    setUserplantowatch(value)
    this
  }

  override def value8(value : Float) : ViewerRecord = {
    setUserdaysspentwatching(value)
    this
  }

  override def value9(value : Gender) : ViewerRecord = {
    setGender(value)
    this
  }

  override def value10(value : String) : ViewerRecord = {
    setLocation(value)
    this
  }

  override def value11(value : Long) : ViewerRecord = {
    setStatsepisodes(value)
    this
  }

  override def values(value1 : Long, value2 : String, value3 : Integer, value4 : Integer, value5 : Integer, value6 : Integer, value7 : Integer, value8 : Float, value9 : Gender, value10 : String, value11 : Long) : ViewerRecord = {
    this.value1(value1)
    this.value2(value2)
    this.value3(value3)
    this.value4(value4)
    this.value5(value5)
    this.value6(value6)
    this.value7(value7)
    this.value8(value8)
    this.value9(value9)
    this.value10(value10)
    this.value11(value11)
    this
  }

  /**
   * Create a detached, initialised ViewerRecord
   */
  def this(id : Long, username : String, userwatching : Integer, usercompleted : Integer, useronhold : Integer, userdropped : Integer, userplantowatch : Integer, userdaysspentwatching : Float, gender : Gender, location : String, statsepisodes : Long) = {
    this()

    set(0, id)
    set(1, username)
    set(2, userwatching)
    set(3, usercompleted)
    set(4, useronhold)
    set(5, userdropped)
    set(6, userplantowatch)
    set(7, userdaysspentwatching)
    set(8, gender)
    set(9, location)
    set(10, statsepisodes)
  }
}

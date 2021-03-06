/*
 * This file is generated by jOOQ.
 */
package generated.tables


import generated.Indexes
import generated.Keys
import generated.Public
import generated.enums.Animestatus
import generated.enums.Animetype
import generated.tables.records.AnimeRecord

import java.lang.Boolean
import java.lang.Class
import java.lang.Float
import java.lang.Integer
import java.lang.Long
import java.lang.String
import java.util.Arrays
import java.util.List

import javax.annotation.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Index
import org.jooq.Name
import org.jooq.Record
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.TableImpl

import scala.Array


object Anime {

  /**
   * The reference instance of <code>public.anime</code>
   */
  val ANIME = new Anime
}

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
class Anime(
  alias : Name,
  child : Table[_ <: Record],
  path : ForeignKey[_ <: Record, AnimeRecord],
  aliased : Table[AnimeRecord],
  parameters : Array[ Field[_] ]
)
extends TableImpl[AnimeRecord](
  alias,
  Public.PUBLIC,
  child,
  path,
  aliased,
  parameters,
  DSL.comment("")
)
{

  /**
   * The class holding records for this type
   */
  override def getRecordType : Class[AnimeRecord] = {
    classOf[AnimeRecord]
  }

  /**
   * The column <code>public.anime.id</code>.
   */
  val ID : TableField[AnimeRecord, Long] = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), "")

  /**
   * The column <code>public.anime.title</code>.
   */
  val TITLE : TableField[AnimeRecord, String] = createField("title", org.jooq.impl.SQLDataType.VARCHAR(50), "")

  /**
   * The column <code>public.anime.imageurl</code>.
   */
  val IMAGEURL : TableField[AnimeRecord, String] = createField("imageurl", org.jooq.impl.SQLDataType.VARCHAR(100), "")

  /**
   * The column <code>public.anime.format</code>.
   */
  val FORMAT : TableField[AnimeRecord, Animetype] = createField("format", org.jooq.impl.SQLDataType.VARCHAR.asEnumDataType(classOf[generated.enums.Animetype]), "")

  /**
   * The column <code>public.anime.source</code>.
   */
  val SOURCE : TableField[AnimeRecord, String] = createField("source", org.jooq.impl.SQLDataType.VARCHAR(20), "")

  /**
   * The column <code>public.anime.episodes</code>.
   */
  val EPISODES : TableField[AnimeRecord, Integer] = createField("episodes", org.jooq.impl.SQLDataType.INTEGER, "")

  /**
   * The column <code>public.anime.status</code>.
   */
  val STATUS : TableField[AnimeRecord, Animestatus] = createField("status", org.jooq.impl.SQLDataType.VARCHAR.asEnumDataType(classOf[generated.enums.Animestatus]), "")

  /**
   * The column <code>public.anime.airing</code>.
   */
  val AIRING : TableField[AnimeRecord, Boolean] = createField("airing", org.jooq.impl.SQLDataType.BOOLEAN, "")

  /**
   * The column <code>public.anime.aired</code>.
   */
  val AIRED : TableField[AnimeRecord, String] = createField("aired", org.jooq.impl.SQLDataType.VARCHAR(500), "")

  /**
   * The column <code>public.anime.duration</code>.
   */
  val DURATION : TableField[AnimeRecord, String] = createField("duration", org.jooq.impl.SQLDataType.VARCHAR(50), "")

  /**
   * The column <code>public.anime.rating</code>.
   */
  val RATING : TableField[AnimeRecord, String] = createField("rating", org.jooq.impl.SQLDataType.VARCHAR(60), "")

  /**
   * The column <code>public.anime.score</code>.
   */
  val SCORE : TableField[AnimeRecord, Float] = createField("score", org.jooq.impl.SQLDataType.REAL, "")

  /**
   * The column <code>public.anime.scoredby</code>.
   */
  val SCOREDBY : TableField[AnimeRecord, Long] = createField("scoredby", org.jooq.impl.SQLDataType.BIGINT, "")

  /**
   * The column <code>public.anime.rank</code>.
   */
  val RANK : TableField[AnimeRecord, Float] = createField("rank", org.jooq.impl.SQLDataType.REAL, "")

  /**
   * The column <code>public.anime.popularity</code>.
   */
  val POPULARITY : TableField[AnimeRecord, Long] = createField("popularity", org.jooq.impl.SQLDataType.BIGINT, "")

  /**
   * The column <code>public.anime.members</code>.
   */
  val MEMBERS : TableField[AnimeRecord, Long] = createField("members", org.jooq.impl.SQLDataType.BIGINT, "")

  /**
   * The column <code>public.anime.genre</code>.
   */
  val GENRE : TableField[AnimeRecord, String] = createField("genre", org.jooq.impl.SQLDataType.VARCHAR(50), "")

  /**
   * Create a <code>public.anime</code> table reference
   */
  def this() = {
    this(DSL.name("anime"), null, null, null, null)
  }

  /**
   * Create an aliased <code>public.anime</code> table reference
   */
  def this(alias : String) = {
    this(DSL.name(alias), null, null, generated.tables.Anime.ANIME, null)
  }

  /**
   * Create an aliased <code>public.anime</code> table reference
   */
  def this(alias : Name) = {
    this(alias, null, null, generated.tables.Anime.ANIME, null)
  }

  private def this(alias : Name, aliased : Table[AnimeRecord]) = {
    this(alias, null, null, aliased, null)
  }

  def this(child : Table[_ <: Record], key : ForeignKey[_ <: Record, AnimeRecord]) = {
    this(Internal.createPathAlias(child, key), child, key, generated.tables.Anime.ANIME, null)
  }

  override def getSchema : Schema = Public.PUBLIC

  override def getIndexes : List[ Index ] = {
    return Arrays.asList[ Index ](Indexes.ANIME_PKEY)
  }

  override def getPrimaryKey : UniqueKey[AnimeRecord] = {
    Keys.ANIME_PKEY
  }

  override def getKeys : List[ UniqueKey[AnimeRecord] ] = {
    return Arrays.asList[ UniqueKey[AnimeRecord] ](Keys.ANIME_PKEY)
  }

  override def as(alias : String) : Anime = {
    new Anime(DSL.name(alias), this)
  }

  override def as(alias : Name) : Anime = {
    new Anime(alias, this)
  }

  /**
   * Rename this table
   */
  override def rename(name : String) : Anime = {
    new Anime(DSL.name(name), null)
  }

  /**
   * Rename this table
   */
  override def rename(name : Name) : Anime = {
    new Anime(name, null)
  }
}

//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: chat.proto

package com.toy.kotlinspringchat.proto;

@kotlin.jvm.JvmName("-initializemessage")
public inline fun message(block: com.toy.kotlinspringchat.proto.MessageKt.Dsl.() -> kotlin.Unit): com.toy.kotlinspringchat.proto.Message =
  com.toy.kotlinspringchat.proto.MessageKt.Dsl._create(com.toy.kotlinspringchat.proto.Message.newBuilder()).apply { block() }._build()
public object MessageKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.toy.kotlinspringchat.proto.Message.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.toy.kotlinspringchat.proto.Message.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.toy.kotlinspringchat.proto.Message = _builder.build()

    /**
     * <code>string msgType = 1;</code>
     */
    public var msgType: kotlin.String
      @JvmName("getMsgType")
      get() = _builder.getMsgType()
      @JvmName("setMsgType")
      set(value) {
        _builder.setMsgType(value)
      }
    /**
     * <code>string msgType = 1;</code>
     */
    public fun clearMsgType() {
      _builder.clearMsgType()
    }

    /**
     * <code>string data = 2;</code>
     */
    public var data: kotlin.String
      @JvmName("getData")
      get() = _builder.getData()
      @JvmName("setData")
      set(value) {
        _builder.setData(value)
      }
    /**
     * <code>string data = 2;</code>
     */
    public fun clearData() {
      _builder.clearData()
    }
    /**
     * <code>string data = 2;</code>
     * @return Whether the data field is set.
     */
    public fun hasData(): kotlin.Boolean {
      return _builder.hasData()
    }

    /**
     * <code>.com.toy.kotlinspringchat.proto.User user = 3;</code>
     */
    public var user: com.toy.kotlinspringchat.proto.User
      @JvmName("getUser")
      get() = _builder.getUser()
      @JvmName("setUser")
      set(value) {
        _builder.setUser(value)
      }
    /**
     * <code>.com.toy.kotlinspringchat.proto.User user = 3;</code>
     */
    public fun clearUser() {
      _builder.clearUser()
    }
    /**
     * <code>.com.toy.kotlinspringchat.proto.User user = 3;</code>
     * @return Whether the user field is set.
     */
    public fun hasUser(): kotlin.Boolean {
      return _builder.hasUser()
    }
    public val dataOneofCase: com.toy.kotlinspringchat.proto.Message.DataOneofCase
      @JvmName("getDataOneofCase")
      get() = _builder.getDataOneofCase()

    public fun clearDataOneof() {
      _builder.clearDataOneof()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.toy.kotlinspringchat.proto.Message.copy(block: com.toy.kotlinspringchat.proto.MessageKt.Dsl.() -> kotlin.Unit): com.toy.kotlinspringchat.proto.Message =
  com.toy.kotlinspringchat.proto.MessageKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val com.toy.kotlinspringchat.proto.MessageOrBuilder.userOrNull: com.toy.kotlinspringchat.proto.User?
  get() = if (hasUser()) getUser() else null


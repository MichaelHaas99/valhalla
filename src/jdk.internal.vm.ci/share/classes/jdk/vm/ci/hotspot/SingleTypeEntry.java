package jdk.vm.ci.hotspot;

public interface SingleTypeEntry{


    HotSpotResolvedObjectType getValidType();

    boolean maybeNull();

    boolean neverNull();

    boolean alwaysNull();

    boolean inlineType();

    void setDeoptClassCheck();
    void setDeoptNullCheck();

}

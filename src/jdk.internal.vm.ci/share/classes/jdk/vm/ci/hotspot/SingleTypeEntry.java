package jdk.vm.ci.hotspot;

public interface SingleTypeEntry{


    boolean isTypeNone();

    boolean isTypeUnknown();

    boolean wasNullSeen();

    long klassPart();

    HotSpotResolvedObjectType getValidType();

    boolean maybeNull();

    boolean neverNull();

    boolean alwaysNull();

    boolean inlineType();

    void setDeoptClassCheck();
    void setDeoptNullCheck();

}

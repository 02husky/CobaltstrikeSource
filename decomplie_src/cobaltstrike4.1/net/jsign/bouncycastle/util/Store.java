package net.jsign.bouncycastle.util;

import java.util.Collection;

public interface Store<T> {
   Collection<T> getMatches(Selector<T> var1) throws StoreException;
}

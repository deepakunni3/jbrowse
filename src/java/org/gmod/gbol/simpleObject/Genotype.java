package org.gmod.gbol.simpleObject;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Autogenerated extension of org.gmod.gbol.simpleObject.generated.Genotype.
 * Add custom code to this file. 
 *
 * Author: Robert Bruggner, rbruggner@berkeleybop.org
 *
*/

public class Genotype extends org.gmod.gbol.simpleObject.generated.AbstractGenotype {

    private static final long serialVersionUID = 1L;

    public Genotype(){
        super();
    }

//    @Override
//    public Collection<AbstractSimpleObject> getWriteObjects() {
//        ArrayList<AbstractSimpleObject> writeObjects = new ArrayList<AbstractSimpleObject>();
//        // Have to write yourself
//        writeObjects.add(this);
//                
//        // Multiples
//        for (PhenotypeDescription pd : this.getPhenotypeDescriptions())
//            writeObjects.addAll(pd.getWriteObjects());
//
//        // Specifically not traversing PhenotypeStatements, since that 
//        // could involve us in a loop or a very long traversal
//
//        return writeObjects;
//    }

    public AbstractSimpleObjectIterator getWriteableObjects()
    {
        return new SimpleObjectIterator(this);
    }
    
    private static class SimpleObjectIterator extends AbstractSimpleObjectIterator
    {
        private static class Status extends AbstractSimpleObjectIterator.Status
        {
            public static final int phenotypeDescs = 1;
        }
                
        public SimpleObjectIterator(Genotype genotype)
        {
            super(genotype);
        }

        public AbstractSimpleObject next()
        {
            Genotype genotype = (Genotype)object;
            AbstractSimpleObject retVal = null;
            if (status == Status.self) {
                retVal = peek();
                processCollectionIterators(Status.phenotypeDescs, genotype.getPhenotypeDescriptions());
            }
            else {
                retVal = soIter.next();
                if (status == Status.phenotypeDescs) {
                    processLastCollectionIterator();
                }
            }
            current = retVal;
            return retVal;
        }
    }


}
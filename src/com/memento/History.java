package com.memento;

import com.memento.DocumentState;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<DocumentState> documents = new ArrayList<>();

    public void push(DocumentState doc)
    {
        documents.add(doc);
    }

    public DocumentState pop()
    {
        int lastIndex = documents.size() - 1;
        DocumentState lastDocument = documents.get(lastIndex);
        documents.remove(lastDocument);

        return lastDocument;
    }
}

package com.example.partialmock

import com.example.Contrived
import com.example.Service
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Spy
import org.mockito.runners.MockitoJUnitRunner

import static org.mockito.Matchers.any
import static org.mockito.Mockito.doReturn
import static org.mockito.Mockito.never
import static org.mockito.Mockito.verify

@RunWith(MockitoJUnitRunner)
class _1PartialMockMockito {
    @Mock private Service service
    @Spy @InjectMocks private Contrived contrived

    @Test
    void serviceShouldNeverBeCalled() {
        // given
        doReturn("stuff").when(contrived).singleParamDelegate(any())

        // when
        contrived.singleParamDelegateForEach("object", "value", "experiment")

        // then
        verify(service, never()).singleParamMethod(any())
    }
}

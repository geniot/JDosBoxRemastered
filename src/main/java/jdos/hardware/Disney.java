package jdos.hardware;

import jdos.misc.setup.Module_base;
import jdos.misc.setup.Section;

public class Disney extends Module_base {
    public static Section.SectionFunction DISNEY_Init = new Section.SectionFunction() {
        public void call(Section section) {
        }
    };

    public Disney(Section configuration) {
        super(configuration);
    }
}

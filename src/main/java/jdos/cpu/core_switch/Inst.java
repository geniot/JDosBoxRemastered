package jdos.cpu.core_switch;

public enum Inst {
    ADD_R8, ADD_E8, ADD_R8_R8, ADD_E8_R8, ADD_R8_E8,
    ADD_R16, ADD_E16, ADD_R16_R16, ADD_E16_R16, ADD_R16_E16,
    ADD_R32, ADD_E32, ADD_R32_R32, ADD_E32_R32, ADD_R32_E32,

    OR_R8, OR_E8, OR_R8_R8, OR_E8_R8, OR_R8_E8,
    OR_R16, OR_E16, OR_R16_R16, OR_E16_R16, OR_R16_E16,
    OR_R32, OR_E32, OR_R32_R32, OR_E32_R32, OR_R32_E32,

    ADC_R8, ADC_E8, ADC_R8_R8, ADC_E8_R8, ADC_R8_E8,
    ADC_R16, ADC_E16, ADC_R16_R16, ADC_E16_R16, ADC_R16_E16,
    ADC_R32, ADC_E32, ADC_R32_R32, ADC_E32_R32, ADC_R32_E32,

    SBB_R8, SBB_E8, SBB_R8_R8, SBB_E8_R8, SBB_R8_E8,
    SBB_R16, SBB_E16, SBB_R16_R16, SBB_E16_R16, SBB_R16_E16,
    SBB_R32, SBB_E32, SBB_R32_R32, SBB_E32_R32, SBB_R32_E32,

    AND_R8, AND_E8, AND_R8_R8, AND_E8_R8, AND_R8_E8,
    AND_R16, AND_E16, AND_R16_R16, AND_E16_R16, AND_R16_E16,
    AND_R32, AND_E32, AND_R32_R32, AND_E32_R32, AND_R32_E32,

    SUB_R8, SUB_E8, SUB_R8_R8, SUB_E8_R8, SUB_R8_E8,
    SUB_R16, SUB_E16, SUB_R16_R16, SUB_E16_R16, SUB_R16_E16,
    SUB_R32, SUB_E32, SUB_R32_R32, SUB_E32_R32, SUB_R32_E32,

    XOR_R8, XOR_E8, XOR_R8_R8, XOR_E8_R8, XOR_R8_E8,
    XOR_R16, XOR_E16, XOR_R16_R16, XOR_E16_R16, XOR_R16_E16,
    XOR_R32, XOR_E32, XOR_R32_R32, XOR_E32_R32, XOR_R32_E32,

    CMP_R8, CMP_E8, CMP_R8_R8, CMP_E8_R8, CMP_R8_E8,
    CMP_R16, CMP_E16, CMP_R16_R16, CMP_E16_R16, CMP_R16_E16,
    CMP_R32, CMP_E32, CMP_R32_R32, CMP_E32_R32, CMP_R32_E32,

    PUSH16_ES, POP16_ES, PUSH16_CS, /*POP16CS,*/ PUSH16_SS, POP16_SS,
    PUSH16_DS, POP16_DS, PUSH16_FS, POP16_FS, PUSH16_GS, POP16_GS,

    PUSH32_ES, POP32_ES, PUSH32_CS, /*POP32CS,*/ PUSH32_SS, POP32_SS,
    PUSH32_DS, POP32_DS, PUSH32_FS, POP32_FS, PUSH32_GS, POP32_GS,

    NOP, ILLEGAL, HLT,

    DAA, DAS, AAA, AAS,

    INC_R8, INC_E8, INC_R16, INC_E16, INC_R32, INC_E32,
    DEC_R8, DEC_E8, DEC_R16, DEC_E16, DEC_R32, DEC_E32,

    PUSH16, PUSH16_R16, PUSH16_E16, PUSH32, PUSH32_R32, PUSH32_E32,
    POP16, POP16_R16, POP16_E16, POP32, POP32_R32, POP32_E32,

    PUSH16A, PUSH32A, POP16A, POP32A,

    BOUND16, BOUND32,

    ARPL_R16_R16, ARPL_R16_E16, ARPL_R32_R32, ARPL_R32_E32,

    IMUL_R16_R16, IMUL_R16_E16, IMUL_R32_R32, IMUL_R32_E32,

    STRING_EXCEPTION, STRING,

    JUMP16_JO, JUMP16_NJO, JUMP16_B, JUMP16_NB, JUMP16_Z, JUMP16_NZ, JUMP16_BE, JUMP16_NBE,
    JUMP16_S, JUMP16_NS, JUMP16_P, JUMP16_NP, JUMP16_L, JUMP16_NL, JUMP16_LE, JUMP16_NLE,

    JUMP32_JO, JUMP32_NJO, JUMP32_B, JUMP32_NB, JUMP32_Z, JUMP32_NZ, JUMP32_BE, JUMP32_NBE,
    JUMP32_S, JUMP32_NS, JUMP32_P, JUMP32_NP, JUMP32_L, JUMP32_NL, JUMP32_LE, JUMP32_NLE,

    TEST_R8, TEST_E8, TEST_R8_R8, TEST_E8_R8,
    TEST_R16, TEST_E16, TEST_R16_R16, TEST_E16_R16,
    TEST_R32, TEST_E32, TEST_R32_R32, TEST_E32_R32,

    XCHG_R8_R8, XCHG_E8_R8, XCHG_R16_R16, XCHG_E16_R16, XCHG_R32_R32, XCHG_E32_R32,

    MOV_R8, MOV_E8, MOV_R8_R8, MOV_E8_R8, MOV_R8_E8, MOV_E8_R8_RM5,
    MOV_R16, MOV_E16, MOV_R16_R16, MOV_E16_R16, MOV_R16_E16,
    MOV_R32, MOV_E32, MOV_R32_R32, MOV_E32_R32, MOV_R32_E32,

    LEA_R16, LEA_R32,

    MOV_ES_R16, MOV_ES_E16, MOV_SS_R16, MOV_SS_E16, MOV_DS_R16, MOV_DS_E16, MOV_FS_R16, MOV_FS_E16, MOV_GS_R16, MOV_GS_E16,

    CBW, CWD, CBWE, CDQ,

    PUSHF, POPF,

    SAHF, LAHF,

    MOV_AL_0b, MOV_0b_AL, MOV_AX_0w, MOV_0w_AX, MOV_EAX_0d, MOV_0d_EAX,

    MOVSB16, MOVSB16r, MOVSB32, MOVSB32r, MOVSW16, MOVSW16r, MOVSW32, MOVSW32r, MOVSD16, MOVSD16r, MOVSD32, MOVSD32r,

    ROLB_0_flags, RORB_0_flags, ROLB_E8_0_flags, RORB_E8_0_flags,
    ROLB_R8, ROLB_E8, ROLB_R8_CL, ROLB_E8_CL,
    RORB_R8, RORB_E8, RORB_R8_CL, RORB_E8_CL,
    RCLB_R8, RCLB_E8, RCLB_R8_CL, RCLB_E8_CL,
    RCRB_R8, RCRB_E8, RCRB_R8_CL, RCRB_E8_CL,
    SHLB_R8, SHLB_E8, SHLB_R8_CL, SHLB_E8_CL,
    SHRB_R8, SHRB_E8, SHRB_R8_CL, SHRB_E8_CL,
    SARB_R8, SARB_E8, SARB_R8_CL, SARB_E8_CL,

    ROLW_0_flags, RORW_0_flags, ROLW_E16_0_flags, RORW_E16_0_flags,
    ROLW_R16, ROLW_E16, ROLW_R16_CL, ROLW_E16_CL,
    RORW_R16, RORW_E16, RORW_R16_CL, RORW_E16_CL,
    RCLW_R16, RCLW_E16, RCLW_R16_CL, RCLW_E16_CL,
    RCRW_R16, RCRW_E16, RCRW_R16_CL, RCRW_E16_CL,
    SHLW_R16, SHLW_E16, SHLW_R16_CL, SHLW_E16_CL,
    SHRW_R16, SHRW_E16, SHRW_R16_CL, SHRW_E16_CL,
    SARW_R16, SARW_E16, SARW_R16_CL, SARW_E16_CL,

    ROLD_R32, ROLD_E32, ROLD_R32_CL, ROLD_E32_CL,
    RORD_R32, RORD_E32, RORD_R32_CL, RORD_E32_CL,
    RCLD_R32, RCLD_E32, RCLD_R32_CL, RCLD_E32_CL,
    RCRD_R32, RCRD_E32, RCRD_R32_CL, RCRD_E32_CL,
    SHLD_R32, SHLD_E32, SHLD_R32_CL, SHLD_E32_CL,
    SHRD_R32, SHRD_E32, SHRD_R32_CL, SHRD_E32_CL,
    SARD_R32, SARD_E32, SARD_R32_CL, SARD_E32_CL,

    LES16, LES32, LDS16, LDS32,

    CALL16_AP, CALL16_EP, CALL16_Jw, CALL16_R16, CALL16_E16, CALL16_EP_E16,
    CALL32_AP, CALL32_EP, CALL32_Jd, CALL32_R16, CALL32_E16, CALL32_EP_E32,
    RETN16_Iw, RETN16, RETF_Iw, RETN32_Iw, RETN32, RETF32_Iw,
    ENTER, LEAVE16, LEAVE32,
    JMP16, JMP_AP, JMP16_R16, JMP16_E16, JMP16_EP,
    JMP32, JMP32_R32, JMP32_E32, JMP32_EP,

    INT3, INTIb, INTO, IRET, ICEBP,

    AAM, AAD,

    SALC, CMC, CLC, STC,

    XLAT16, XLAT32,

    LOOPNZ16_CX, LOOPNZ16_ECX, LOOPZ16_CX, LOOPZ16_ECX, LOOP16_CX, LOOP16_ECX, JCXZ16_CX, JCXZ16_ECX,
    LOOPNZ32_CX, LOOPNZ32_ECX, LOOPZ32_CX, LOOPZ32_ECX, LOOP32_CX, LOOP32_ECX, JCXZ32_CX, JCXZ32_ECX,

    IN_AL_Ib, IN_AX_Ib, IN_EAX_Ib, OUT_Ib_AL, OUT_Ib_AX, OUT_Ib_EAX,
    IN_AL_DX, IN_AX_DX, IN_EAX_DX, OUT_DX_AL, OUT_DX_AX, OUT_DX_EAX,

    NOT_R8, NOT_E8, NOT_R16, NOT_E16, NOT_R32, NOT_E32,

    NEG_R8, NEG_E8, NEG_R16, NEG_E16, NEG_R32, NEG_E32,

    MUL_R8, MUL_E8, MUL_R16, MUL_E16, MUL_R32, MUL_E32,
    IMUL_R8, IMUL_E8, IMUL_R16, IMUL_E16, IMUL_R32, IMUL_E32,
    DIV_R8, DIV_E8, DIV_R16, DIV_E16, DIV_R32, DIV_E32,
    IDIV_R8, IDIV_E8, IDIV_R16, IDIV_E16, IDIV_R32, IDIV_E32,

    CLI, STI,

    CLD, STD,

    CALLBACK, MODIFIED,

    SLDT_R16, SLDT_E16, STR_R16, STR_E16, LLDT_R16, LLDT_E16, LTR_R16, LTR_E16, VERR_R16, VERR_E16, VERW_R16, VERW_E16,

    SGDT, SIDT, LGDT16, LGDT32, LIDT16, LIDT32, SMSW_E16, LMSW_E16, INVLPG, LGDT_R, LIDT_R, SMSW_R16, LMSW_R16, SMSW_R32,


    FPU0_normal, FPU0_ea, FPU1_normal, FPU1_ea, FPU2_normal, FPU2_ea, FPU3_normal, FPU3_ea,
    FPU4_normal, FPU4_ea, FPU5_normal, FPU5_ea, FPU6_normal, FPU6_ea, FPU7_normal, FPU7_ea
}

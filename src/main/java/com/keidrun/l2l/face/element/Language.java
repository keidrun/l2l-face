/**
 * Copyright 2017 Keid
*/
package com.keidrun.l2l.face.element;

/**
 * Programming languages.
 * 
 * @author Keid
 */
public enum Language {

    // Not defined language.
    NOT_DEFINED("None", "Not defined"),

    // @formatter:off
    // Programming languages beginning with A.
    A_SHARP_DOT_NET("A#"),A_SHARP_AXIOM("A#-Axiom"),A_0("A-0"),A_PLUS("A+"),A_PLUS_PLUS("A++"),
    ABAP("ABAP"),ABC("ABC"),ABC_ALGOL("ABC-ALGOL"),ABSET("ABSET"),ABSYS("ABSYS"),ACC("ACC"),
    ACCENT("Accent"),ACE("Ace"),ACL2("ACL2"),ACICSOFT("Avicsoft"),ACT_3("ACT-III"),
    ACTION_EXCLAMATION("Action!"),ACTION_SCRIPT("ActionScript"),
    ADA("Ada"),ADENINE("Adenine"),AGDA("Agda"),AGILENT_VEE("Agilent-VEE"),
    AGORA("Agora"),APPLE("apple"),AIMMS("AIMMS"),ALEF("Alef"),ALF("ALF"),
    ALGOL_58("ALGOL-58"),ALGOL_60("ALGOL-60"),ALGOL_68("ALGOL-68"),ALGOL_W("ALGOL-W"),
    ALICE("Alice"),ALMA0("Alma-0"),AMBIENT_TALK("AmbientTalk"),AMIGA_E("Amiga-E"),
    AMOS("AMOS"),AMPL("AMPL"),ANGULARJS("AngularJS"),APEX("Apex"),APL("APL"),
    APP_INVENTOR("App-Inventor"),APPLE_SCRIPT("AppleScript"),ARC("Arc"),
    AREXX("ARexx"),ARGUS("Argus"),ASPECTJ("AspectJ"),ASSEMBLY("Assembly"),
    ATS("ATS"),ATEJI_PX("Ateji-PX"),AUTO_HOTKEY("AutoHotkey"),AUTO_CODER("Autocoder"),
    AUTO_IT("AutoIt"),AUTO_LISP("AutoLISP"),VISUAL_LISP("Visual-LISP"),AVEREST("Averest"),AWK("AWK"),
    AXUM("Axum"),ACTIVE_SERVER_PAGES("Active-Server-Pages"),ASP_DOT_NET("ASP"),

    // Programming languages beginning with B.
    B("B"),BABBAGE("Babbage"),BASH("Bash"),BASIC("BASIC"),bc("bc"),BCPL("BCPL"),BEAN_SHELL("BeanShell"),
    BATCH("Batch","Bat"),BERTRAND("Bertrand"),BETA("BETA"),BISTRO("Bistro"),BIT_C("BitC"),BLISS("BLISS"),
    BLOCKLY("Blockly"),BLOO_P("BlooP"),BOO("Boo"),BOOMERANG("Boomerang"),BOURNE_SHELL("BourneShell"),
    BREW("BREW"),BPEL("BPEL"),BUSINESS_BASIC("BusinessBasic"),

    // Programming languages beginning with C.
    C("C"),C_MINUS_MINUS("C--"),C_PLUS_PLUS("C++"),C_SHARP("C#"),C_AL("C/AL"),CACHE("Cache"),C_SHELL("C-Shell"),
    CAML("Caml"),CAYENNE("Cayenne"),C_DUCE("CDuce"),CECIL("Cecil"),CESIL("Cesil"),CEU("Ceu"),CEYLON("Ceylon"),
    CF_ENGINE("CFEngine"),CFML("CFML"),CG("Cg"),CH("Ch"),CHAPEL("Chapel"),CHARITY("Charity"),CHARM("Charm"),
    CHEF("Chef"),CHILL("CHILL"),CHIP_8("CHIP-8"),CHOMSKI("chomski"),CHUCK("ChucK"),CICS("CICS"),CILK("Cilk"),
    CITRINE("Citrine"),CL("CL"),CLAIRE("Claire"),CLARION("Clarion"),CLEAN("Clean"),CLIPPER("Clipper"),CLIPS("CLIPS"),
    CLIST("CLIST"),CLOJURE("Clojure"),CLU("CLU"),CMS_2("CMS-2"),COBOL("COBOL"),COBOL_SCRIPT("CobolScript"),
    COBRA("Cobra"),CODE("CODE"),COFFEE_SCRIPT("CoffeeScript"),COLD_FUSION("ColdFusion"),COMAL("COMAL"),
    COMBINED_PROGRAMMING_LANGUAGE("Combined-Programming-Language"),COMIT("COMIT"),CIL("CIL"),
    COMMON_LISP("Common-Lisp"),COMPASS("COMPASS"),COMPONENT_PASCAL("Component-Pascal"),CHR("CHR"),COMTRAN("COMTRAN"),
    CONVERGE("Converge"),COOL("Cool"),COQ("Coq"),CORAL_66("Coral-66"),CORN("Corn"),COR_VISION("CorVision"),
    COWSEL("COWSEL"),CPL("CPL"),CRYPTOL("Cryptol"),CSH("csh"),C_SOUND("Csound"),CSP("CSP"),CUDA("CUDA"),
    CURL("Curl"),CURRY("Curry"),CYBIL("Cybil"),CYCLONE("Cyclone"),CYTHON("Cython"),

    // Programming languages beginning with D.
    D("D"),DASL("DASL"),DASL_DISTRIBUTED("DASL-Distributed"),DART("Dart"),DATA_FLEX("DataFlex"),
    DATALOG("Datalog"),DATATRIEVE("DATATRIEVE"),D_BASE("dBase"),DC("dc"),DCL("DCL"),DEESEL("Deesel"),
    DELPHI("Delphi"),DINK_C("DinkC"),DIBOL("DIBOL"),DOG("Dog"),DRACO("Draco"),
    DRAKON("DRAKON"),DYLAN("Dylan"),DYNAMO("DYNAMO"),

    // Programming languages beginning with E.
    E("E"),E_SHARP("E#"),EAR_SKETCH("EarSketch"),EASE("Ease"),EASY_PLI("Easy-PL/I"),EASY("Easy"),
    EASYTRIEVE_PLUS("EASYTRIEVE-PLUS"),ECMA_SCRIPT("ECMAScript"),EDINBURGH_IMP("Edinburgh-IMP"),
    EGL("EGL"),EIFFEL("Eiffel"),ELAN("ELAN"),ELIXIR("Elixir"),ELM("Elm"),EMACS_LISP("Emacs-Lisp"),
    EMERALD("Emerald"),EPIGRAM("Epigram"),EPL("EPL"),ERLANG("Erlang"),ES("es"),ESCHER("Escher"),
    ESPOL("ESPOL"),ESTEREL("Esterel"),ETOYS("Etoys"),EUCLID("Euclid"),EULER("Euler"),
    EUPHORIA("Euphoria"),EUS_LISP_ROBOT("EusLisp-Robot"),CMS_EXEC("CMS-EXEC"),
    EXEC_2("EXEC-2"),EXECUTABLE_UML("Executable-UML"),

    // Programming languages beginning with F.
    F("F"),F_SHARP("F#"),F_STAR("F*"),FACTOR("Factor"),FALCON("Falcon"),FANTOM("Fantom"),
    FAUST("FAUST"),FFP("FFP"),FJOLNIR("Fjolnir"),FL("FL"),FLAVORS("Flavors"),FLEX("Flex"),
    F_LOOP("FlooP"),FLOW_MATIC("FLOW-MATIC"),FOCAL("FOCAL"),FOCUS("FOCUS"),FOIL("FOIL"),
    FORMAC("FORMAC"),AT_FORMULA("@Formula"),FORTH("Forth"),FORTRAN("Fortran"),
    FORTRESS("Fortress"),FOX_BASE("FoxBase"),FOX_PRO("FoxPro"),FP("FP"),
    FRANZ_LISP("Franz-Lisp"),FREGE("Frege"),F_SCRIPT("F-Script"),

    // Programming languages beginning with G.
    G("G"),GAME_MAKER_LANGUAGE("Game-Maker-Language"),GAME_MONKEY_SCRIPT("GameMonkey-Script"),
    GAMS("GAMS"),GAP("GAP"),G_CODE("G-code"),GD_SCRIPT("GDScript"),GENIE("Genie"),
    GDL("GDL"),GJ("GJ"),GEORGE("GEORGE"),GLSL("GLSL"),GNU_E("GNU-E"),GM("GM"),GO("Go"),
    GO_EXCLAMATION("Go!"),GOAL("GOAL"),GODEL("Godel"),GOLO("Golo"),GOM("GOM"),
    GOOGLE_APPS_SCRIPT("Google-Apps-Script"),GOSU("Gosu"),GOTRAN("GOTRAN"),
    GPSS("GPSS"),GRAPH_TALK("GraphTalk"),GRASS("GRASS"),GROOVY("Groovy"),

    // Programming languages beginning with H.
    HACK("Hack"),HAGGIS("HAGGIS"),HAL_S("HAL/S"),HAMILTON_C_SHELL("Hamilton-C-shell"),HARBOUR("Harbour"),
    HARTMANN_PIPELINES("Hartmann-pipelines"),HASKELL("Haskell"),HAXE("Haxe"),HERMES("Hermes"),
    HIGH_LEVEL_ASSEMBLY("High-Level-Assembly"),HLSL("HLSL"),HOP("Hop"),HOPSCOTCH("Hopscotch"),
    HOPE("Hope"),HUGO("Hugo"),HUME("Hume"),HYPERTALK("HyperTalk"),

    // Programming languages beginning with I.
    IBM_BASIC_ASSEMBLY("IBM-Basic-assembly"),IBM_HASCRIPT("IBM-HAScript"),IBM_INFORMIX_4GL("IBM-Informix-4GL"),
    IBM_RPG("IBM-RPG"),ICI("ICI"),ICON("Icon"),ID("Id"),IDL("IDL"),IDRIS("Idris"),IMP("IMP"),
    INFORM("Inform"),INTERLISP("INTERLISP"),IO("Io"),IOKE("Ioke"),IPL("IPL"),
    IPTSCRAE("IPTSCRAE"),ISLISP("ISLISP"),ISPF("ISPF"),ISWIM("ISWIM"),

    // Programming languages beginning with J.
    J("J"),J_SHARP("J#"),J_PLUS_PLUS("J++"),JADE("JADE"),JAL("JAL"),
    JANUS_CONCURRENT("Janus-concurrent"),JANUS_TIME_REVERSIBLE("Janus-time-reversible"),JASS("JASS"),
    JAVA("Java"),JAVA_SCRIPT("JavaScript"),JCL("JCL"),JEAN("JEAN"),JOIN_JAVA("Join-Java"),JOSS("JOSS"),
    JOULE("Joule"),JOVIAL("JOVIAL"),JOY("Joy"),J_SCRIPT("JScript"),J_SCRIPT_DOT_NET("JScript-.NET"),
    JAVA_FX_SCRIPT("JavaFX Script"),JULIA("Julia"),JYTHONE("Jython"),

    // Programming languages beginning with K.
    K("K"),KALEIDOSCOPE("Kaleidoscope"),KAREL("Karel"),KAREL_PLUS_PLUS("Karel++"),
    KEE("KEE"),KIXTART("Kixtart"),KLERER_MAY_SYSTEM("Klerer-May-System"),
    KIF("KIF"),KOJO("Kojo"),KOTLIN("Kotlin"),KRC("KRC"),KRL("KRL"),
    KUKA_ROBOT_LANGUAGE("KUKA-Robot-Language"),KRYPTON("KRYPTON"),KSH("ksh"),

    // Programming languages beginning with L.
    L("L"),L_SHARP_DOT_NET("L#-.NET"),LAB_VIEW("LabVIEW"),LADDER("Ladder"),LAGOONA("Lagoona"),
    LANSA("LANSA"),LASSO("Lasso"),LAVA("Lava"),LC_3("LC-3"),LEDA("Leda"),LEGOSCRIPT("Legoscript"),
    LIL("LIL"),LILY_POND("LilyPond"),LIMBO("Limbo"),LIMNOR("Limnor"),LINC("LINC"),LINGO("Lingo"),
    LIS("LIS"),LISA("LISA"),LISAAC("Lisaac"),LISP("Lisp"),LITE_C("Lite-C"),LITHE("Lithe"),
    LITTLE_B("Little-b"),LOGO("Logo"),LOGTALK("Logtalk"),LOTUS_SCRIPT("LotusScript"),
    LPC("LPC"),LSE("LSE"),LSL("LSL"),LIVE_SCRIPT("LiveScript"),LUA("Lua"),
    LUCID("Lucid"),LUSTRE("Lustre"),LY_A_PAS("LYaPAS"),LYNX("Lynx"),

    // Programming languages beginning with M.
    M2001("M2001"),M4("M4"),M_SHARP("M#"),MACHINE_CODE("Machine-code"),MAD("MAD"),MAD_I("MAD/I"),
    MAGIK("Magik"),MAGMA("Magma"),MAKE("make"),MAUDE_SYSTEM("Maude-system"),MAPLE("Maple"),
    MAPPER("MAPPER"),MARK_IV("MARK-IV"),MARY("Mary"),MASM_MICROSOFT_ASSEMBLY_X86("MASM-Microsoft-Assembly-x86"),
    MATH_MATIC("MATH-MATIC"),MATHEMATICA("Mathematica"),MATLAB("MATLAB"),MAXIMA("Maxima"),
    MAX("Max"),MAXSCRIPT("MaxScript"),MAYA("Maya"),MDL("MDL"),MERCURY("Mercury"),
    MESA("Mesa"),METAFONT("Metafont"),MICROCODE("Microcode"),MICRO_SCRIPT("MicroScript"),
    MIIS("MIIS"),MILK("Milk"),MIMIC("MIMIC"),MIRAH("Mirah"),MIRANDA("Miranda"),MIVA_SCRIPT("MIVA-Script"),
    ML("ML"),MODEL_204("Model-204"),MODELICA("Modelica"),MODULA("Modula"),MODULA_2("Modula-2"),
    MODULA_3("Modula-3"),MOHOL("Mohol"),MOO("MOO"),MORTRAN("Mortran"),MOUSE("Mouse"),
    MPD("MPD"),MATHCAD("Mathcad"),MSIL("MSIL"),MSL("MSL"),MUMPS("MUMPS"),MPL("MPL"),

    // Programming languages beginning with N.
    NASM("NASM"),NAPIER88("Napier88"),NEKO("Neko"),NEMERLE("Nemerle"),NES_C("nesC"),NESL("NESL"),
    NET_DOT_DATA("Net.Data"),NET_LOGO("NetLogo"),NET_REXX("NetRexx"),NEW_LISP("NewLISP"),
    NEWP("NEWP"),NEWSPEAK("Newspeak"),NEWTONSCRIPT("NewtonScript"),NGL("NGL"),NIAL("Nial"),
    NICE("Nice"),NICKLE("Nickle"),NIM("Nim"),NO("NO"),NPL_NORD("NPL-Nord"),NXC("NXC"),NQC("NQC"),
    NSIS("NSIS"),NU("Nu"),NUMPY("Numpy"),NW_SCRIPT("NWScript"),NXT_G("NXT-G"),
    NPL_NEURAL_PARALLEL("NPL-Neural-parallel"),

    // Programming languages  beginning with O.
    O_COLON_XML("o:XML"),OAK("Oak"),OBERON("Oberon"),OBJ2("OBJ2"),OBJECT_LISP("Object-Lisp"),
    OBJECT_LOGO("ObjectLOGO"),OBJECT_REXX("Object-REXX"),OBJECT_PASCAL("Object-Pascal"),
    OBJECTIVE_C("Objective-C"),OBJECTIVE_J("Objective-J"),OBLIQ("Obliq"),OCAML("OCaml"),
    OCCAM("occam"),OCCAM_PAI("occam-pai"),OCTAVE("Octave"),OMNI_MARK("OmniMark"),
    ONYX("Onyx"),OPA("Opa"),OPAL("Opal"),OPEN_CL("OpenCL"),OPEN_EDGE_ABL("OpenEdge-ABL"),
    OPL("OPL"),OPEN_VERA("OpenVera"),OPS5("OPS5"),OPTIM_J("OptimJ"),ORC("Orc"),
    ORCA_MODULA_2("ORCA/Modula-2"),ORIEL("Oriel"),ORWELL("Orwell"),OXYGENE("Oxygene"),
    OZ("Oz"),

    // Programming languages beginning with P.
    P_APOSTROPHE_APOSTROPHE("P''"),P_SHARP("P#"),PARA_SAIL("ParaSail"),PARI_GP("PARI/GP"),
    PASCAL("Pascal"),PCASTL("PCASTL"),PCF("PCF"),PEARL("PEARL"),PEOPLE_CODE("PeopleCode"),
    PERL("Perl"),PDL("PDL"),PERL_6("Perl-6"),PHARO("Pharo"),PHP("PHP"),PICO("Pico"),
    PICOLISP("Picolisp"),PICT("Pict"),PIKE("Pike"),PIKT("PIKT"),PILOT("PILOT"),
    PIPELINES("Pipelines"),PIZZA("Pizza"),PL_11("PL-11"),PL_0("PL/0"),PL_B("PL/B"),
    PL_C("PL/C"),PL_I("PL/I"),PL_M("PL/M"),PL_P("PL/P"),PL_SQL("PL/SQL"),PL360("PL360"),
    PLANC("PLANC"),PLANKALKUL("Plankalkul"),PLANNER("Planner"),PLEX("PLEX"),PLEXIL("PLEXIL"),
    PLUS("Plus"),POP_11("POP-11"),POP_2("POP-2"),POST_SCRIPT("PostScript"),PORTABLE("PortablE"),
    POWERHOUSE("Powerhouse"),POWER_BUILDER("PowerBuilder"),POWER_SHELL("PowerShell"),
    PPL("PPL"),PROCESSING("Processing"),PROCESSING_JS("Processing.js"),PROGRAPH("Prograph"),
    PROIV("PROIV"),PROLOG("Prolog"),PROMAL("PROMAL"),PROMELA("Promela"),PROSE("PROSE"),
    PROTEL("PROTEL"),PROVIDE_X("ProvideX"),PRO_STAR_C("Pro*C"),PURE("Pure"),
    PURE_DATA("Pure-Data"),PYTHON("Python"),

    // Programming languages beginning with Q.
    Q("Q"),Q_KX("Q-Kx"),QALB("Qalb"),QT_SCRIPT("QtScript"),
    QUAKE_C("QuakeC"),QPL("QPL"),

    // Programming languages beginning with R.
    R("R"),R_PLUS_PLUS("R++"),RACKET("Racket"),RAPID("RAPID"),RAPIRA("Rapira"),RATFIV("Ratfiv"),
    RATFOR("Ratfor"),RC("rc"),REBOL("REBOL"),RED("Red"),REDCODE("Redcode"),REFAL("REFAL"),
    REIA("Reia"),REXX("REXX"),RLAB("Rlab"),ROOP("ROOP"),RPG("RPG"),RPL("RPL"),RSL("RSL"),
    RTL_2("RTL/2"),RUBY("Ruby"),RUNE_SCRIPT("RuneScript"),RUST("Rust"),

    // Programming languages beginning with S.
    S("S"),S2("S2"),S3("S3"),S_LANG("S-Lang"),S_PLUS("S-PLUS"),SA_C("SA-C"),SABRE_TALK("SabreTalk"),
    SAIL("SAIL"),SALSA("SALSA"),SAM76("SAM76"),SAS("SAS"),SASL("SASL"),SATHER("Sather"),
    SAWZALL("Sawzall"),SBL("SBL"),SCALA("Scala"),SCHEME("Scheme"),SCILAB("Scilab"),SCRATCH("Scratch"),
    SCRIPT_DOT_NET("Script.NET"),SED("Sed"),SEED7("Seed7"),SELF("Self"),SENSE_TALK("SenseTalk"),
    SEQUENCE_L("SequenceL"),SETL("SETL"),SIMPOL("SIMPOL"),SIGNAL("SIGNAL"),SIMPLE("SiMPLE"),
    SIMSCRIPT("SIMSCRIPT"),SIMULA("Simula"),SIMULINK("Simulink"),SINGULARITY("Singularity"),
    SISAL("SISAL"),SLIP("SLIP"),SMALL("SMALL"),SMALLTALK("Smalltalk"),SMALL_BASIC("Small-Basic"),
    SML("SML"),STRONGTALK("Strongtalk"),SNAP_EXCLAMATION("Snap!"),SNOBOL("SNOBOL"),SNOWBALL("Snowball"),
    SOL("SOL"),SPARK("SPARK"),SPEEDCODE("Speedcode"),SPIN("SPIN"),SP_K("SP/k"),SPS("SPS"),
    SQL("SQL"),SQR("SQR"),SQUEAK("Squeak"),SQUIRREL("Squirrel"),SR("SR"),S_SL("S/SL"),
    STACKLESS_PYTHON("Stackless-Python"),STARLOGO("Starlogo"),STRAND("Strand"),STATA("Stata"),
    STATEFLOW("Stateflow"),SUBTEXT("Subtext"),SUPER_COLLIDER("SuperCollider"),SUPER_TALK("SuperTalk"),
    SWIFT("Swift"),SWIFT_PARALLEL("Swift-parallel"),SYMPL("SYMPL"),SYMSYN("Symsyn"),
    SYNC_CHARTS("SyncCharts"),SYSTEM_VERILOG("SystemVerilog"),

    // Programming languages beginning with T.
    T("T"),TACL("TACL"),TACPOL("TACPOL"),TADS("TADS"),TAL("TAL"),TCL("Tcl"),TEA("Tea"),
    TECO("TECO"),TELCOMP("TELCOMP"),TEX("TeX"),TEXT_EXECUTIVE_LANGUAGE("Text-Executive-Programming-Language"),
    TIE("TIE"),TIMBER("Timber"),TMG("TMG"),TOM_PATTERN_MATCHING("Tom-pattern-matching"),TOM("TOM"),
    TOUCH_DEVELOP("TouchDevelop"),TOI("Toi"),TOPSPEED("Topspeed"),TPU("TPU"),TRAC("Trac"),TTM("TTM"),
    T_SQL("T-SQL"),TRANSCRIPT("Transcript"),TTCN("TTCN"),TURING("Turing"),TUTOR("TUTOR"),
    TXL("TXL"),TYPE_SCRIPT("TypeScript"),TURBO_C_PLUS_PLUS("Turbo-C++"),

    // Programming languages beginning with U.
    UBERCODE("Ubercode"),UCSD_PASCAL("UCSD-Pascal"),UMPLE("Umple"),UNICON("Unicon"),
    UNIFACE("Uniface"),UNITY("UNITY"),UNIX_SHELL("Unix-shell"),UNREAL_SCRIPT("UnrealScript"),

    // Programming languages beginning with V.
    VALA("Vala"),VERILOG("Verilog"),VHDL("VHDL"),Visual_Basic("Visual-Basic"),
    VISUAL_BASIC_DOT_NET("Visual-Basic-.NET"),VISUAL_DATA_FLEX("Visual-DataFlex"),
    VISUAL_DIALOG_SCRIPT("Visual-DialogScript"),VISUAL_FORTRAN("Visual-Fortran"),
    VISUAL_FOX_PRO("Visual-FoxPro"),VISUAL_J_PLUS_PLUS("Visual-J++"),
    VISUAL_J_SHARP("Visual-J#"),VISUAL_OBJECTS("Visual-Objects"),
    VISUAL_PROLOG("Visual-Prolog"),VSXU("VSXu"),VVVV("vvvv"),

    // Programming languages beginning with W.
    WATFIV("WATFIV"),WATFOR("WATFOR"),WEB_DNA("WebDNA"),WEB_QL("WebQL"),WHILEY("Whiley"),
    WINDOWS_POWER_SHELL("Windows-PowerShell"),WINBATCH("Winbatch"),
    WOLFRAM_LANGUAGE("Wolfram-Language"),WYVERN("Wyvern"),

    // Programming languages beginning with X.
    XBL("XBL"),XC("XC"),X_HARBOUR("xHarbour"),XL("XL"),XOJO("Xojo"),XOTCL("XOTcl"),
    XPL("XPL"),XPL0("XPL0"),XQUERY("XQuery"),XSB("XSB"),X_SHARP("XSharp"),
    XSLT("XSLT"),XTEND("Xtend"),

    // Programming languages beginning with W.
    YORICK("Yorick"),YQL("YQL"),YOIX("Yoix"),

    // Programming languages beginning with Z.
    Z_NOTATION("Z-notation"),ZENO("Zeno"),ZOPL("ZOPL"),ZSH("Zsh"),ZPL("ZPL");
    // @formatter:on

    /**
     * Language's names.
     */
    private String[] names;

    /**
     * Constructor.
     * 
     * @param names
     *            language's names
     */
    private Language(String... names) {
        this.names = names;
    }

    /**
     * Get language's names.
     * 
     * @return the language's names
     */
    public String[] getNames() {
        return names;
    }

    /**
     * Get the language enum from the language's name.
     * 
     * @param name
     *            the language's name
     * @return the language enum
     */
    public static Language valueOfName(String name) {

        for (Language v : Language.values()) {
            for (String n : v.getNames()) {
                if (name.toLowerCase().equals(n.toLowerCase())) {
                    return v;
                }
            }
        }

        return Language.NOT_DEFINED;
    }

}

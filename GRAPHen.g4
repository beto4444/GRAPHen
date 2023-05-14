grammar GRAPHen;
WS : [ \n\t]+ -> skip;
LETTER: ('a'..'z' | 'A'..'Z');

POS_NUMBER: ('1'..'9')('0'..'9')*;
NUMBER: ('0'|POS_NUMBER);
IDENTIFIER: (LETTER|'_')(LETTER|NUMBER)*;
NODE_KW: 'Node';
EDGE_KW: 'Edge';
VAL_KW: 'Val';
COL_KW: 'Color';
NODE_SPEC: 'Nodetype';
EDGE_CPEC: 'Edgetype';
GRAPH_KW: 'Graph';
DIGHRAPH_KW: 'Digraph';
NODE_ORD: 'NodeOrderDown';
COL_G: 'Graphcolor';
GEN: 'Generate';
COLOR : '#' HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT;
HEXDIGIT : '0'..'9' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'a' | 'b' | 'c' | 'd' | 'e' | 'f';
// Gramatyka formatu:
  start : (statement+) EOF;

  statement : node_definition
         | edge_definition
         | digraph_definition
         | graph_definition
         | graph_function_statement;

  //właściwości
  edgeDir: '->'|'<->';
  lineType: '-' | '.-';
  nodeShape: 'o'| '*' | '+' | 'd';

  //wierzchołki
  node_definition : 'Node ' IDENTIFIER '{' node_properties '};';
  node_properties : 'Num_color ' (NUMBER|POS_NUMBER) (', ' 'fillColor ' COLOR)? ((', ' | ',') 'borderColor ' COLOR)?
                        ((', ' | ',') 'nodeShape ' nodeShape)? ((', ' | ',') 'borderWidth ' POS_NUMBER)? ((', ' | ',') 'borderLineShape ' lineType)?;

  //krawędzie
  edge_definition : 'Edge ' IDENTIFIER '{' edge_properties '};';
  edge_properties : 'Num_color ' (NUMBER|POS_NUMBER) ((', ' | ',')('lineWidth' POS_NUMBER))? ((', ' | ',') 'Color ' COLOR)? ((', ' | ',') 'lineType' lineType);

  //grafy i digrafy
  graph_definition : 'Graph ' IDENTIFIER '{'  edge_list  ('};' |('}.' graph_function)';');
  digraph_definition : 'Digraph ' IDENTIFIER '{'  edge_list '}' ('.'graph_function)? ';';

  edge_list : edge_relation ((', ' | ',') edge_relation)*;
  edge_relation : IDENTIFIER edgeDir IDENTIFIER;

  //funkcje do grafów
  graph_function: (         exportToFileFunc
                           |'NodeOrderDown({' IDENTIFIER+ '})'
                           | 'colorEdges()'
                           | 'colorNodes()')
                           ;

  graph_function_statement:  IDENTIFIER '.' graph_function ';';
  fileFormat: ('.png' | '.svg' | '.gren');
  exportToFileFunc: 'export(' 'format' fileFormat (', ' | ',') 'fileName' IDENTIFIER')';



/* że global atributes??
  digraph_attributes : '.' 'NodeOrderDown' '{' IDENTIFIER+ '}' ';'?
         | '.' 'Graphcolor' '{' COLOR+ '}' ';'?
         | '.' 'Generate' '{' FILENAME '}' ';'?;

  graph_attributes : '.' 'NodeOrderDown' '{' IDENTIFIER+ '}' ';'?
                | '.' 'Graphcolor' '{' COLOR+ '}' ';'?
                | '.' 'Generate' '{' FILENAME '}' ';'?;
  */

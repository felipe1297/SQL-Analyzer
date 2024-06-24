import sys
import psycopg2
from psycopg2 import sql

def test_connection(conn_str):
    try:
        conn = psycopg2.connect(conn_str)
        conn.close()
        print("Connection successful")
        sys.exit(0)
    except Exception as e:
        print(f"Connection failed: {e}")
        sys.exit(1)

if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Usage: python test_connection.py <connection_string>")
        sys.exit(1)
    
    connection_string = sys.argv[1]
    test_connection(connection_string)

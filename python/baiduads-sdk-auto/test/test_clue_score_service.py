"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from cluescore.api.clue_score_service import ClueScoreService  # noqa: E501


class TestClueScoreService(unittest.TestCase):
    """ClueScoreService unit test stubs"""

    def setUp(self):
        self.api = ClueScoreService()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_clue_result_file_url(self):
        """Test case for get_clue_result_file_url

        """
        pass

    def test_query_clue_task_status(self):
        """Test case for query_clue_task_status

        """
        pass

    def test_submit_clue_task(self):
        """Test case for submit_clue_task

        """
        pass


if __name__ == '__main__':
    unittest.main()
